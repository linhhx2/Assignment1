package dao;

import model.Publisher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class PublisherDaoImpl implements PublisherDao {
    static final String PUBLISHER_FILE = "publisher.csv";
    public List<Publisher> publishers = null;
    public PublisherDaoImpl() throws IOException {
        this.publishers = load();
    }
    @Override
    public boolean add(Publisher publisher) throws IOException {
        // TODO
        return false;
    }

    @Override
    public boolean delete(String id) throws IOException {
        // TODO
        return false;
    }

    @Override
    public boolean update(Publisher publisher) throws IOException {
        // TODO
        return false;
    }

    @Override
    public Publisher getById(String id) {
        // TODO
        return null;
    }

    @Override
    public List<Publisher> getAll() {
        return this.publishers;
    }

    public void flush() throws IOException {
        List<String> lines = new ArrayList<>();
        for (Publisher p: this.publishers) {
            lines.add(p+"\n");
        }
        Files.write(Paths.get(PUBLISHER_FILE), "Id|Name|Phone\n".getBytes());
        for (String line: lines) {
            Files.write(Paths.get(PUBLISHER_FILE), line.getBytes(), StandardOpenOption.APPEND);
        }
    }

    private List<Publisher> load() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(PUBLISHER_FILE));
        List<Publisher> publishers = new ArrayList<>();
        for (int i=1; i< lines.size();++i) {
            String[] cs = lines.get(i).split("\\|");
            publishers.add(new Publisher(cs[0], cs[1], cs[2]));
        }
        return publishers;
    }
}
